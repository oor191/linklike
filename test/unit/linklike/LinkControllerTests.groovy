package linklike



import grails.test.mixin.*
import org.junit.*


/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LinkController)
@Mock([Link])

class LinkControllerTests {

    void testSize() {
        mockDomain( Link, [ [title: 'link1', url: 'www.google.com'],
    		        	   [title: 'link2', url: 'www.hotmail.com'] ])

        def model = controller.index()
    	assert model.links.size() == 2
    }

    void testNoVoteLike(){
    	 def link = new Link(title: 'link0', url:'www.ku.ac.th')
    	 link.save()
    	 params.id = link.id
    	 assertEquals 0, link.voteScore
    }

    void testVoteLike(){
    	 def link = new Link(title: 'link1', url:'www.ku.ac.th', voteScore: 3)
    	 link.save()
    	 params.id = link.id
    	 controller.vote()
    	 assertEquals 4, link.voteScore
    }
}
