/*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2006 - 2013 Pentaho Corporation and Contributors.  All rights reserved.
*/

package org.pentaho.reporting.libraries.formula.operators;

import org.pentaho.reporting.libraries.formula.FormulaTestBase;

import java.math.BigDecimal;

/**
 * Creation-Date: 10.04.2007, 15:31:58
 *
 * @author Thomas Morgner
 */
public class ArithmeticOperatorTest extends FormulaTestBase {

  public Object[][] createDataTest() {
    return new Object[][]
      {
        { "(1/3)*3", new BigDecimal( 1 ) },
        { "(5/24)*24", new BigDecimal( 5 ) },
      };
  }

  public ArithmeticOperatorTest() {
  }

  public ArithmeticOperatorTest( final String s ) {
    super( s );
  }

  public void testDefault() throws Exception {
    runDefaultTest();
  }

}
