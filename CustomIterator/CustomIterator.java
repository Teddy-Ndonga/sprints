package CustomIterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomIterator implements Iterator<Integer>{

    private List<Integer> numbers;  //stores the list being iterated.
    private int index;  //keeps track of the current position.

    //Constructor - stores the provided list and starts the iterator at the first element.
    public CustomIterator(List<Integer> numbers){
        this.numbers = numbers;
        this.index = 0;
    }

    //hasNext()
    @Override
    public boolean hasNext() {
        return index < numbers.size();
    }

    //next()
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return numbers.get(index++);
    }
}
    

//next() 
//This method:

//Checks if another element exists.
//Throws NoSuchElementException if not.
//Returns the current element.
//Increments index for the next call.

