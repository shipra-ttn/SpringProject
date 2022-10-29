package com.Spring.SpringProject.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class BinarySearchImpl {

    @Autowired
    //@Qualifier("Quick")
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers,int numToSearch)
    {
        int[] sortedNumbers=sortAlgorithm.sort(numbers);
        int i=0,j=sortedNumbers.length;
        System.out.println(sortAlgorithm);
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(numbers[mid]==numToSearch)
                return mid;
            else  if(numbers[mid]<numToSearch)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }

        }

        return -1;
    }
}

