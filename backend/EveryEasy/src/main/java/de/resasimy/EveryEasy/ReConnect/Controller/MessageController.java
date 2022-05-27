package de.resasimy.EveryEasy.ReConnect.Controller;

import de.resasimy.EveryEasy.ReConnect.Entity.Message;
import de.resasimy.EveryEasy.ReConnect.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping("/reconnect/message")
    public ResponseEntity<Message> addMessage(@RequestBody Message message) {
        return new ResponseEntity<>(messageRepository.save(message), HttpStatus.CREATED);
    }

    @PutMapping("/reconnect/message")
    public ResponseEntity<Message> editMessage(@RequestBody Message message) {
        return new ResponseEntity<>(messageRepository.save(message), HttpStatus.CREATED);
    }

    @GetMapping("/reconnect/message/{messageId}")
    public ResponseEntity<Optional<Message>> getMessage(@PathVariable String messageId) {
        return new ResponseEntity<>(messageRepository.findById(messageId), HttpStatus.OK);
    }

    @DeleteMapping("/reconnect/message/{messageId}")
    public ResponseEntity<Void> deleteMessage(@PathVariable String messageId) {
        messageRepository.deleteById(messageId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/reconnect/getMessage/{chatId}")
    public ResponseEntity<List<Message>> getMessagesByChat(@PathVariable String chatId){
        return new ResponseEntity<>(messageRepository.findByChatId(chatId), HttpStatus.OK);
    }
}
