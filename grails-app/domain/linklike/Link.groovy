package linklike

class Link {
    String title
    String url
    Integer voteScore = 0
    
    static constraints = {
    }

    def addVote(score){
    	if (score > 0)
    		voteScore += score
    }
}
