package elite_sport_team_selector;

public class TeamQuestionnaire {

		// Atributes of the class TeamQuestionnaire
	
		private int candidateAge;
		private int candidateHeight;
		private boolean candidateInjuries;
		
		//Constructor of the class TeamQuestionnaire
	
		public TeamQuestionnaire(int candidateAge,int candidateHeight, boolean candidateInjuries) {
			this.candidateAge = candidateAge;
			this.candidateHeight = candidateHeight;
			this.candidateInjuries = candidateInjuries;
			}
			//Method of the class TeamQuestionnaire
	
			public int getCandidateAge() {
				return candidateAge;
			}
	
				public int getCandidateHeight() {
					return candidateHeight;
				
				}
	
					public boolean getCandidateInjuries() {
						return candidateInjuries;
						
					}
	
				}

