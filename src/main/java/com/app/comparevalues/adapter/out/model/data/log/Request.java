package com.app.comparevalues.adapter.out.model.data.log;

public class Request {
	 private String type;
	    private String url;
	    private String path;
	    private String method;
	    private String queryParameter;
	    private String protocol;
	    private String header;
	    private Object body;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getMethod() {
			return method;
		}
		public void setMethod(String method) {
			this.method = method;
		}
		public String getQueryParameter() {
			return queryParameter;
		}
		public void setQueryParameter(String queryParameter) {
			this.queryParameter = queryParameter;
		}
		public String getProtocol() {
			return protocol;
		}
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}
		public String getHeader() {
			return header;
		}
		public void setHeader(String header) {
			this.header = header;
		}
		public Object getBody() {
			return body;
		}
		public void setBody(Object body) {
			this.body = body;
		}
		public Request(String type, String url, String path, String method, String queryParameter, String protocol,
				String header, Object body) {
			super();
			this.type = type;
			this.url = url;
			this.path = path;
			this.method = method;
			this.queryParameter = queryParameter;
			this.protocol = protocol;
			this.header = header;
			this.body = body;
		}
		public Request() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
