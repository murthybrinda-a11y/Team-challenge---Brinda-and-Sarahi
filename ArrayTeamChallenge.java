public class ArrayTeamChallenge 
{ 
    public static void main(String[] args) 
    { 
        int[] scores = {78, 92, 85, 67, 95, 88, 73, 90}; 

        // Challenge 1: Display every score in the array using a loop.
        for(int i = 0; i < scores.length; i++) 
        { 
            System.out.print(scores[i] + " "); 
        } 
        System.out.println("\n");

        // Challenge 2: Calculate and display the average score dynamically.
        double sum = 0;
        for(int i = 0; i < scores.length; i++) 
        { 
            sum = sum + scores[i]; 
        } 
        // Using scores.length ensures this works if more scores are added
        double avg = sum / scores.length; 
        System.out.println("Average score: " + avg + "\n");

        // Challenge 3: Find and display the highest and lowest score.
        int highestScore = scores[0]; 
        int lowestScore = scores[0]; 
        for (int i = 0; i < scores.length; i++) 
            { 
            if (scores[i] < lowestScore) 
            { 
                lowestScore = scores[i]; 
            } 
            if (scores[i] > highestScore) 
            { 
                highestScore = scores[i]; 
            } 
        } 
        System.out.println("Lowest score: " + lowestScore); 
        System.out.println("Highest score: " + highestScore + "\n"); 

        // Challenge 4: Count and display how many scores are above the average.
        int countAboveAverage = 0;
        for (int i = 0; i < scores.length; i++) 
        {
            if (scores[i] > avg) 
            {
                countAboveAverage++;
            }
        }
        System.out.println("Number of scores above average: " + countAboveAverage + "\n");

        // BONUS 1 - REVERSE ORDER:
        for(int c = scores.length - 1; c >= 0; c--) 
            { 
                System.out.print(scores[c] + " "); 
            } 
        System.out.println("\n\n");

        // BONUS 2 - SCORE SEARCH:
        int target = 88;
        for(int i = 0; i < scores.length; i++) 
            { 
            if(scores[i] == target) 
                { 
                    System.out.println("Score " + target + " found at index: " + i); 
                } 
        } 
    } 
}
