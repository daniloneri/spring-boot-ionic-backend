package com.daniloneri.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.daniloneri.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
