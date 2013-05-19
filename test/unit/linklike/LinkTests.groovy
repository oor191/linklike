package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Link)
class LinkTests {
	
    void testAddVote(){
    	def l = new Link(title: 'ddd',url: 'www')
    	l.addVote(2)
    	assertEquals 2,l.voteScore
    }
}
