/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private int steps;
    private int alpha;
    private int[] arg;


    /**
     * Constructs a box bug that traces a square of a given side length
     * param length the side length
     */
    public DancingBug(int[] arg)
    {
        steps = 0;
        alpha = 0;
      this.arg = arg;

   }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        for (int i = 0; i <arg.length ; i++) {
            System.out.println(arg[i]);
        }
        if(steps<arg.length-1){
            alpha = arg[steps];
            setDirection(getDirection() + alpha*45);
            steps++;
            move();
        } else {
            steps = 0;
        }

    }
} 