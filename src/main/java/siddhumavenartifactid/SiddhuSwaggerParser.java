/**
 * 
 */
package siddhumavenartifactid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.core.models.SwaggerParseResult;

/**
 * @author Siddhartha
 *
 */
public class SiddhuSwaggerParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 final Logger logger = LoggerFactory.getLogger(SiddhuSwaggerParser.class);
		 
		// TODO Auto-generated method stub
		// parse a swagger description from the petstore and get the result
		  SwaggerParseResult result = new OpenAPIParser().readLocation("http://localhost:8080/v2/api-docs", null, null);
		  
		  // or from a file
		  //   SwaggerParseResult result = new OpenAPIParser().readLocation("./path/to/openapi.yaml", null, null);
		  
		  // the parsed POJO
		  OpenAPI openAPI = result.getOpenAPI();
		  
		  //if (result.getMessages() != null) result.getMessages().forEach(System.err::println); // validation errors and warnings
		  
		  if (openAPI != null) {
			  System.out.println("------------------"+openAPI.getInfo().getDescription());
			   logger.info("------------------"+openAPI);
			  
		  }

	}

}
