package com.stocks.loginservice.services;

import org.springframework.stereotype.Service;
import com.stocks.loginservice.repository.ConfirmationTokenRepository;
import com.stocks.loginservice.entity.*;

@Service
public class ConfirmationTokenService {

	private ConfirmationTokenRepository confirmationTokenRepository;

	void saveConfirmationToken(ConfirmationToken confirmationToken) {

		confirmationTokenRepository.save(confirmationToken);
    }
    
    void deleteConfirmationToken(Long id){

        confirmationTokenRepository.deleteById(id);
    }

}