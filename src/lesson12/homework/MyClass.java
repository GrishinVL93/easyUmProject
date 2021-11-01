package lesson12.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MyClass implements CollectionUtils{


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        throwNullPointerException(a, b);

        ArrayList<Integer> unionList = new ArrayList<Integer>();
        unionList.addAll(a);
        unionList.addAll(b);

        return unionList;
    }



    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        throwNullPointerException(a, b);

        ArrayList<Integer> intersectList = new ArrayList<Integer>();

        for(Integer num: a){
            if(b.contains(num)){
                intersectList.add(num);
            }
        }

        for(Integer num: b){
            if(a.contains(num)){
                intersectList.add(num);
            }
        }

        return intersectList;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        throwNullPointerException(a, b);
        HashSet<Integer> unionSet = new HashSet<>();
        unionSet.addAll(a);
        unionSet.addAll(b);
        return unionSet;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        throwNullPointerException(a, b);
        HashSet<Integer> intersectionSet = new HashSet<>();
        for(Integer num: a){
            if(b.contains(num)){
                intersectionSet.add(num);
            }
        }
        return intersectionSet;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        throwNullPointerException(a, b);
        ArrayList<Integer> differenceList = new ArrayList<>();
        for(Integer num: b){
            if(!a.contains(num)){

            }
        }
        return null;
    }

    private void throwNullPointerException(Collection<Integer> a, Collection<Integer> b) {
        if (a == null){
            throw new NullPointerException("a == null");
        }

        if(b == null){
            throw new NullPointerException("b == null");
        }
    }
}
