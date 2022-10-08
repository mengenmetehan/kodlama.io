package com.metehanmengen.week2;

import java.util.ArrayList;

public class Stack<E> extends ArrayList<E> {


        public boolean empty()
        {
            return isEmpty();
        }

        public E peek()
        {
            return get(size() - 1);
        }

        public E pop()
        {
            E result = remove(size() - 1);

            return result;
        }


        public E push(E item)
        {
            add(item);

            return item;
        }

        public int search(Object o)
        {
            for (int i = 0; i < size(); i++)
                if(o.equals(get(i)))
                    return i;

            return -1;
        }
}
