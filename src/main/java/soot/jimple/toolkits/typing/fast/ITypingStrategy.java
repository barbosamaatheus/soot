package soot.jimple.toolkits.typing.fast;

import java.util.List;

import soot.Local;
import soot.util.Chain;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 2008 Ben Bellamy 
 * 
 * All rights reserved.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

/**
 * Provides a way to use different was to create and minimize typings
 * 
 * @author Marc Miltenberger
 */
public interface ITypingStrategy {

  /**
   * Creates a new typing class instance with initialized bottom types for the given locals
   * 
   * @param locals
   *          the locals
   * @return the typing
   */
  public Typing createTyping(Chain<Local> locals);

  /**
   * Creates a new typing class as a copy from a given class
   * 
   * @param locals
   *          the locals
   * @return the typing
   */
  public Typing createTyping(Typing tg);

  /**
   * Minimize the given typing list using the hierarchy
   * 
   * @param tgs
   *          the typign list
   * @param h
   *          the hierarchy
   */
  public void minimize(List<Typing> tgs, IHierarchy h);
}
