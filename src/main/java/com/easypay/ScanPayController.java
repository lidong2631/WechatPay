package com.easypay;

import org.springframework.web.bind.annotation.RestController;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class ScanPayController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello";
	}
	
	@RequestMapping(value = "/scanpay", 
					method = RequestMethod.POST,
					consumes = MediaType.APPLICATION_XML_VALUE)
	ResponseEntity<?> processTransaction(@RequestBody String input) {
		
		System.out.println("request body : " + input);
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ScanPayParameters.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			StringReader stringReader = new StringReader(input);
			ScanPayParameters scanPayParameters = (ScanPayParameters)jaxbUnmarshaller.unmarshal(stringReader);
			System.out.println("appid : " + scanPayParameters.getAppid());
			System.out.println("mch_id : " + scanPayParameters.getMch_id());
			System.out.println("sub_mch_id: " + scanPayParameters.getSub_mch_id());
			System.out.println("nonce_str: " + scanPayParameters.getNonce_str());
			System.out.println("sign: " + scanPayParameters.getSign());
			System.out.println("body: " + scanPayParameters.getBody());
			System.out.println("out_trade_no: " + scanPayParameters.getOut_trade_no());
			System.out.println("total_fee: " + scanPayParameters.getTotal_fee());
			System.out.println("fee_type: " + scanPayParameters.getFee_type());
			System.out.println("spbill_create_ip: " + scanPayParameters.getSpbill_create_ip());
			System.out.println("auth_code: " + scanPayParameters.getAuth_code());
			
			if (!validateSign(scanPayParameters)) {
				return new ResponseEntity<>("Bad Request!", HttpStatus.BAD_REQUEST);
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<>("Accepted!", HttpStatus.OK);
		
	}
	
	boolean validateSign(ScanPayParameters scanPayParameters) {
		
		if (scanPayParameters.getAppid() == null ||
				scanPayParameters.getMch_id() == null ||	
				scanPayParameters.getSub_mch_id() == null ||
				scanPayParameters.getNonce_str() == null ||
				scanPayParameters.getSign() == null ||
				scanPayParameters.getBody() == null ||
				scanPayParameters.getOut_trade_no() == null ||
				scanPayParameters.getTotal_fee() == null ||
				scanPayParameters.getFee_type() == null ||
				scanPayParameters.getSpbill_create_ip() == null ||
				scanPayParameters.getAuth_code() == null)
			return false;
		
		// check sign
		return true;
	}
}