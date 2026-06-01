package dsa.oops.Trees.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


  //Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int val) {
          this.val = val;
      }

  }

public class Main {
      int code= 0;
    public static void main(String[] args) {
        List<List<Integer>> p = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            p.add(new ArrayList<>());
        }
        List<List<Integer>> pp = new ArrayList<>();
        for (int i = 0; i <2; i++) {
            pp.add(new ArrayList<>());
        }

      List<Integer> ll =  p.get(0);
        ll.addAll(List.of(3,4));
        p.add(0,ll);
        System.out.println(p);
        p.addAll(0,Collections.singletonList(pp.get(0)));
        System.out.println(p);
    }

}