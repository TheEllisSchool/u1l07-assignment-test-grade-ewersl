import javax.swing.JOptionPane;

public class gradecalcwarrays { ;

	
		public static void main(String[] args) {
			String input = JOptionPane.showInputDialog(null, "How many grades will you enter?");
			int numScores = Integer.parseInt((input)) ;
			int [] listScores = new int [numScores];
			
			int index; 
			for (index = 0; index < listScores.length; index++) {
				String score = "";
				score = JOptionPane.showInputDialog(null, "What is your score");
				listScores[index] = Integer.parseInt(score);

			}
			int sumScores = 0;
			for (index = 0; index < listScores.length; index++) {
				sumScores = sumScores + listScores [index];
			}
			int average = sumScores / numScores;
			
			int highest= listScores [0];
			int lowest = listScores [0];
			for (index = 0; index < listScores.length; index++) {
				if (listScores [index] > highest) {
					highest = listScores[index];
				} else {
					lowest= listScores [index];
				}
		
			} 
			
			int averageNoLowest= (sumScores- lowest) / (numScores- 1);
			
		JOptionPane.showMessageDialog (null, "The average is: " + average + "\n" +
		"The average without the lowest is: " + averageNoLowest + "\n" + "The highest grade is: " + highest + "\n" + "The lowest number is: " + lowest);
					
			
			}
		
	}

