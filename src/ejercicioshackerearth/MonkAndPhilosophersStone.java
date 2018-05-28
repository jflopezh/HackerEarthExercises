package ejercicioshackerearth;

import java.util.Scanner;

public class MonkAndPhilosophersStone {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Stack harryBag = new Stack();
        
        for (int i = 0; i < N; i++)
            harryBag.push(new Node(s.nextInt()));
        
        int Q = s.nextInt();
        int X = s.nextInt();
        
        Stack monkBag = new Stack();
        int worthMonkBag = 0;
        
        String instruction;
        Node coin;
        
        for (int i = 0; i < Q; i++) {
            instruction = s.next();
            if (instruction.equals("Harry")) {
                coin = harryBag.pop();
                monkBag.push(coin);
                worthMonkBag += coin.value;
            } else if (instruction.equals("Remove")) {
                monkBag.pop();
            }
            
            if (worthMonkBag == X) {
                
            }
        }
    }
    
}
