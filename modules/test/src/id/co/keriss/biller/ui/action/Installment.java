/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2009 Alejandro P. Revilla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package id.co.keriss.biller.ui.action;

import id.co.keriss.switching.packager.ClientBillPaymentReqPackager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import org.jdom.Element;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOFilter.VetoException;
import org.jpos.iso.channel.NACChannel;
import org.jpos.iso.packager.GenericPackager;
import org.jpos.iso.packager.ISO87BPackager;
import org.jpos.ui.UI;
import org.jpos.ui.UIAware;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;
import org.jpos.util.SimpleLogListener;


public class Installment implements ActionListener, UIAware {
    private NACChannel channel;
    public UI ui;
    public Installment () {
        super();
        createChannel();
    }
    public void setUI (UI ui, Element e) {
        this.ui = ui;
    }
    public void actionPerformed (ActionEvent ev) {
    	try {
    		channel.setPackager(new ClientBillPaymentReqPackager());
    		if(!channel.isConnected())channel.connect();
    		channel.send(inquiry());
    		channel.setPackager(new ISO87BPackager());
			channel.receive();
			channel.disconnect();
		} catch (VetoException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ISOException e) {
			e.printStackTrace();
		}
    }
    
    private ISOMsg inquiry() throws ISOException {
        ISOMsg m = new ISOMsg();
        m.setMTI ("0200");
        m.set (3, "720000");                            //Processing Code
        m.set (4, "000000112500");
        m.set (11, "000002");                           //Systems Trace Number
        m.set (22, "002");
        m.set (24, "001");                               //NII
        m.set (25, "00");
        m.set (35, "00B0000000");
        m.set (41, "12345678");                         //Terminal ID
        m.set (42, "123456789012345");                  //Merchant ID
        return m;
    }

    private void createChannel(){
       byte[] b = new byte[5];
        try {
            Logger logger = new Logger();
            logger.addListener (new SimpleLogListener (System.out));
            channel = new NACChannel("127.0.0.1", 8702, new ISO87BPackager(),b);
            ((LogSource)channel).setLogger (logger, "channel-inquery");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

