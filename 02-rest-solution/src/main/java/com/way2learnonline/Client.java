package com.way2learnonline;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.way2learnonline.dto.ServerDTO;

public class Client {

	public static void main(String[] args) throws URISyntaxException {
		

		RestTemplate restTemplate=  new RestTemplate();
		
		String baseURL="http://localhost:7070/";	
		//restTemplate.getForEntity(baseURL+"/servers",List.class);
		
		ParameterizedTypeReference<List<ServerDTO>> servers= new ParameterizedTypeReference<List<ServerDTO>>(){} ;
		
		
		ResponseEntity<List<ServerDTO>> responseEntity=
				restTemplate.exchange(baseURL+"/servers", HttpMethod.GET, null, servers);
		
		List<ServerDTO> serverDTOs=responseEntity.getBody();
		
		for(ServerDTO serverDTO:serverDTOs){
			System.out.println("Server Name : "+serverDTO.getServerName());
		}
		
		/*ServerDTO dto = new ServerDTO();
		dto.setServerName("11111");
		RequestEntity<ServerDTO> requestEntity = RequestEntity.post(new URI(baseURL+"/servers")).header("xyz", "1","2","3").body(dto);
		ResponseEntity<ServerDTO>  responseEntity = restTemplate.exchange(requestEntity, ServerDTO.class);
		System.out.println(responseEntity.getBody().getServerName());
		System.out.println(responseEntity.getHeaders());*/
		
		
/*		RequestEntity<Void> requestEntity =  RequestEntity.get(new URI(baseURL+"/servers/10")).header("xyz", "1","2","3").build();
		ResponseEntity<ServerDTO>  responseEntity = restTemplate.exchange(requestEntity, ServerDTO.class);
		System.out.println(responseEntity.getBody().getRunningServices());
		System.out.println(responseEntity.getHeaders());
		
		*/
		//String getServerByIdURL=baseURL+"/servers/{1}";	
		
	/*	ServerDTO dto = restTemplate.getForObject(baseURL+"/servers/{id}",  ServerDTO.class, 10);
		System.out.println(dto.getServerName());*/
		
/*		ResponseEntity<ServerDTO> dtoEnt = restTemplate.getForEntity(baseURL+"/servers/{id}", ServerDTO.class,10);	
		System.out.println(dtoEnt.getBody().getServerName());
		System.out.println(dtoEnt.getHeaders());*/
		
		//TODO -1 use RestTemplate to get server with id 1. We dont want headers now
		
	/*	*/
		
		
		
		//TODO-2 use RestTemplate to get server with id 1. We  want headers now	
		
		
		/*String getServerByIdURL=baseURL+"/servers/{id}";		
		ResponseEntity<ServerDTO> responseEntity=restTemplate.getForEntity(getServerByIdURL, ServerDTO.class,1L);		
		
		HttpHeaders httpHeaders=responseEntity.getHeaders();
		
		System.out.println("Headers: "+httpHeaders);
		
		ServerDTO serverDTO=responseEntity.getBody();
		
		System.out.println("Server Name :"+serverDTO.getServerName());*/
		
		
		
		// TODO -3 Use rest template to get all the servers with out headers. Iterate Over the servers and print the server name
		/*
		ParameterizedTypeReference<List<ServerDTO>> servers= new ParameterizedTypeReference<List<ServerDTO>>(){} ;
		
		
		ResponseEntity<List<ServerDTO>> responseEntity=
				restTemplate.exchange(baseURL+"/servers", HttpMethod.GET, null, servers);
		
		List<ServerDTO> serverDTOs=responseEntity.getBody();
		
		for(ServerDTO serverDTO:serverDTOs){
			System.out.println("Server Name : "+serverDTO.getServerName());
		}
		*/
		
		//TODO-4 Use Rest Template to create a new Server .We want the URI of the newly created resource.
		//Now, make a get request to the newly created server and make sure that server name is same
		
		/*ServerDTO serverDTO= new ServerDTO();
		serverDTO.setServerName("AAAAAA");
		
		
		
		URI newIRI= restTemplate.postForLocation("http://localhost:7070/01rest-basics-solution/servers", serverDTO);
		
		System.out.println(newIRI);
		*/
		//TODO-5	Use Rest Template to create a new Server.  We want to print all the response headers and body if any
		
		/*ServerDTO serverDTO= new ServerDTO();
		serverDTO.setServerName("AAAAAA");
		
		ResponseEntity<Object> responseEntity=restTemplate.postForEntity(baseURL+"/servers", serverDTO, null);
		HttpHeaders httpHeaders=responseEntity.getHeaders();
		System.out.println(httpHeaders);
		System.out.println(responseEntity.getBody());*/
	}

}
