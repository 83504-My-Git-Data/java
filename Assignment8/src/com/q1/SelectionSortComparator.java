package com.q1;

import java.util.Comparator;

public class SelectionSortComparator<E> implements Comparator<E>{

	@Override
	public int compare(E o1, E o2) {
		return (Integer) o1- (Integer) o2;
	}

}
