# JavaTags

JavaTags is a small XML/HTML construction library for Java inspired by [lihaoyi's work](https://github.com/lihaoyi/scalatags). 

## Example

Fragment like:

    html5(attr("lang -> en"),
      head(
        meta(attr("http-equiv -> Content-Type", "content -> text/html; charset=UTF-8")),
        title("title"),
        link(attr("href -> xxx.css", "rel -> stylesheet"))
      )
    );
    
renders to:

    <!DOCTYPE html>
     <html lang='en'>
      <head>
      <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>
      <title>title</title>
      <link href='xxx.css' rel='stylesheet'/>
     </head>
    </html>
