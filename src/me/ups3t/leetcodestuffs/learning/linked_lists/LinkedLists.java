package me.ups3t.leetcodestuffs.learning.linked_lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

    private class CustomLinkedList {

        CustomLinkedList next;

        String secretMessage;

        CustomLinkedList(CustomLinkedList next) {
            this.next = next;
        }

        CustomLinkedList() {
            this.next = null;
        }

        void setSecretMessage(String secretMessage) {
            this.secretMessage = secretMessage;
        }

        boolean hasNext() {
            return next != null;
        }
    }

    public void customLinkedLists() {

        CustomLinkedList list5 = new CustomLinkedList();
        list5.setSecretMessage("s");

        CustomLinkedList list4 = new CustomLinkedList(list5);
        list4.setSecretMessage("i");

        CustomLinkedList list3 = new CustomLinkedList(list4);
        list3.setSecretMessage("n");

        CustomLinkedList list2 = new CustomLinkedList(list3);
        list2.setSecretMessage("e");

        CustomLinkedList list = new CustomLinkedList(list2);
        list.setSecretMessage("p");

        CustomLinkedList current = list;

        int t = 1;
        while(current.hasNext()) {
            System.out.print(current.secretMessage);
            current = current.next;
        }

        System.out.print(current.secretMessage);

        System.out.println();

    }

    public void traditionalLinkedLists() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("pen");
        linkedList.add("is");

        Iterator<String> iterator = linkedList.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedLists learn = new LinkedLists();

        learn.traditionalLinkedLists();
        learn.customLinkedLists();

    }

}
