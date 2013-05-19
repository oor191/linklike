package linklike

class LinkController {

    def index() { 
        def links = Link.findAll()
        [ links: links ]
    }

    def create() {
        def link = new Link(title: params.title, url: params.url)
        link.save()
        redirect(action: "index")
    }

    def vote(){
    	def link = Link.get(params.id)
    	link.addVote(1)
    	redirect(action: "index")
    }
}
