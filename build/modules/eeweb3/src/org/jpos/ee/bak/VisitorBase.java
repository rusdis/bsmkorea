/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2007 Alejandro P. Revilla
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

package org.jpos.ee.bak;

import java.util.Map;

public abstract class VisitorBase {
    public abstract Map getProps ();

    public void set (String prop, String value) {
        getProps().put (prop, value);
    }
    public String get (String prop) {
        return (String) getProps().get (prop);
    }
    public String get (String prop, String defValue) {
        String value = (String) getProps().get (prop);
        return value == null ? defValue : value;
    }
}

