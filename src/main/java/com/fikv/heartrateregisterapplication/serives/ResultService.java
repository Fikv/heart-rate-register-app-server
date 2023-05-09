package com.fikv.heartrateregisterapplication.serives;

import com.fikv.heartrateregisterapplication.dtos.ResultDTO;
import com.fikv.heartrateregisterapplication.entities.Result;
import com.fikv.heartrateregisterapplication.repositories.NotificationRepository;
import com.fikv.heartrateregisterapplication.repositories.ResultRepository;
import com.fikv.heartrateregisterapplication.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResultService {
    //TODO zmienic repository na serwisy - w serwisach dodac metody zwarcajace co trzeba
    private final ResultRepository resultRepository;
    private final UserRepository userRepository;
    private final NotificationRepository notificationRepository;

    public void addResult(ResultDTO resultDTO) {
        Result result = Result.builder().user(userRepository.findById(resultDTO.getUserId()).get())
                .notification(notificationRepository.findById(resultDTO.getNotificationId()).get())
                .diastolic(resultDTO.getDiastolic())
                .systolic(resultDTO.getSystolic())
                .heartRate(resultDTO.getHeartRate())
                .dateOfMeasurement(resultDTO.getDateOfMeasurement()).build();
        resultRepository.save(result);
    }

//    public List<ResultDTO> getAllResults(String username) {
//        resultRepository.findAll();
//    }

}
