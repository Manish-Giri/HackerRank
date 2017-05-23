package tutorials.thirtydaysofcode;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by manishgiri on 5/22/17.
 */
public class QueuesAndStacks {

    private static class Solution {
        private Stack<Character> stack;
        private Queue<Character> queue;
        private List<Character> q;

        Solution() {
            stack = new Stack<>();
            queue = new LinkedList<>();
            q = new LinkedList<>();

        }

        private void pushCharacter(char ch) {
            stack.add(ch);
        }

        private char popCharacter() {
            if(!stack.isEmpty()) {
                return stack.pop();
            }
        }


    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
