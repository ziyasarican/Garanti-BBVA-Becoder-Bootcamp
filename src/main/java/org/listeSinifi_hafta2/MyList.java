package org.listeSinifi_hafta2;

public class MyList<T>{

    T[] arr;
    int capacity = 10;
    public MyList() {
        this.arr = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.arr = (T[]) new Object[capacity];

    }

    public int size() {
        int count = 0;
        for (T value : arr){
            if (value != null)
                count++;
        }
        return count;
    }

    public int getCapacity() {
        return arr.length;
    }

    public void add(T item) {
        int index = this.size();
        if (index == this.getCapacity()){
            capacity *= 2;
            T[] tempArr = (T[]) new Object[capacity];
            for (int i = 0; i < this.arr.length; i++) {
                tempArr[i] = this.arr[i];
            }
            this.arr = tempArr;
        }
        arr[index] = item;
    }

    public T get(int index) {
        return this.arr[index];
    }

    public void remove(int index){
        T[] tempArr = (T[]) new Object[capacity];
        if (size() > this.getCapacity() )
            return;
        else {
            for (int i = 0; i < this.arr.length; i++) {
                if (index != i)
                    tempArr[i] = this.arr[i];
                else
                    tempArr[i] = this.arr[i+1];
            }
            this.arr = tempArr;
        }

    }

    public void set(int index, T data){
        if (index > size())
            return;
        this.arr[index] = data;
    }

    public String toString(){
        String str = "";
        for (T value : this.arr) {
            if (value != null)
                str += value + " ";
        }
        return str;
    }

    public int indexOf(T data){
        for (int i = 0; i < this.arr.length; i++) {
            if(data == this.arr[i])
                return i;
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i = this.arr.length-1; i >= 0 ; i--) {
            if(data == this.arr[i])
                return i;
        }
        return -1;
    }

    public boolean isEmpty(){
        if(size() != 0)
            return true;
        return false;
    }

    public T[] toArray(){
        T[] newArray =  (T[]) new Object[capacity];
        newArray = this.arr;

        return newArray;
    }

    public void clear(){
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish){
        MyList<T> tempArr =  new MyList<>();
        int index = 0;
        for (int i = start; i <= finish; i++) {
            tempArr.arr[i] = this.arr[i];
            index ++;
        }
        return tempArr;
    }

    public boolean contains(T data){
        for (T value : this.arr){
            if(data == value)
                return true;

        }
        return false;
    }


}
