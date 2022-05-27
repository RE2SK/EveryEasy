package de.resasimy.EveryEasy.ReConnect.Controller;

import de.resasimy.EveryEasy.ReConnect.Entity.Chat;
import de.resasimy.EveryEasy.ReConnect.Repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ChatController {

    @Autowired
    private ChatRepository chatRepository;

    @PostMapping("/reconnect/chat")
    public ResponseEntity<Chat> addChat(@RequestBody Chat chat) {
        return new ResponseEntity<>(chatRepository.save(chat), HttpStatus.CREATED);
    }

    @PutMapping("/reconnect/chat")
    public ResponseEntity<Chat> editChat(@RequestBody Chat chat) {
        return new ResponseEntity<>(chatRepository.save(chat), HttpStatus.CREATED);
    }

    @GetMapping("/reconnect/chat/{chatId}")
    public ResponseEntity<Optional<Chat>> getChat(@PathVariable String chatId) {
        return new ResponseEntity<>(chatRepository.findById(chatId), HttpStatus.OK);
    }

    @GetMapping("/reconnect/getChats/{userId}")
    public ResponseEntity<List<Chat>> getChatByUserId(@PathVariable String userId){
        List<Chat> chatsOfUser = chatRepository.findByParticipantId1(userId);
        chatsOfUser.addAll(chatRepository.findByParticipantId2(userId));
        return new ResponseEntity<>(chatsOfUser, HttpStatus.OK);
    }
}
