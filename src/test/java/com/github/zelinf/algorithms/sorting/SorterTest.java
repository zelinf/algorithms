package com.github.zelinf.algorithms.sorting;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(JUnitQuickcheck.class)
public class SorterTest {

    @Property
    public void heapSortTest(List<Integer> randomList) throws Exception {
        List<Integer> expected = new ArrayList<>(randomList);
        Collections.sort(expected);

        List<Integer> actual = new ArrayList<>(randomList);
        Sorter<Integer> sorter = new Sorter<>();
        sorter.heapSort(actual);

        Assert.assertEquals(expected, actual);
    }

    @Property
    public void quickSortTest(List<Integer> randomList) throws Exception {
        List<Integer> expected = new ArrayList<>(randomList);
        Collections.sort(expected);

        List<Integer> actual = new ArrayList<>(randomList);
        Sorter<Integer> sorter = new Sorter<>();
        sorter.quickSort(actual);

        Assert.assertEquals(expected, actual);
    }

}