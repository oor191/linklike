<h1>Link Like</h1>

<g:form name="linkCreateForm" url="[action:'create']">
  Title: <g:textField name="title"/><br/>
  URL: <g:textField name="url"/><br/>
  <input type="submit" value="Add new link"/>
</g:form>

<hr>

<ul>
  <% if(links.size() == 0) { %>
    <li>No links</li>
  <% } else { %>
    <% for(link in links) { %>
      <g:form name="resultCreateForm" url="[action:'vote', id:link.id]">
        <li><%= "Title:" +" "+ link.title %></li>
        <li><%= "URL:" + " " + link.url %></li>
        <li><%= "Vote Score:" + " " + link.voteScore %></li>
        <input type="submit" value="VOTE"/>
      </g:form>
    <% } %> 
  <% } %>
</ul>
