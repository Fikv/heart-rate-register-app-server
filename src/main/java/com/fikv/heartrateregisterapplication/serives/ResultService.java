package com.fikv.heartrateregisterapplication.serives;

import com.fikv.heartrateregisterapplication.dtos.ResultDTO;
import com.fikv.heartrateregisterapplication.dtos.SearchDatesDTO;
import com.fikv.heartrateregisterapplication.entities.Result;
import com.fikv.heartrateregisterapplication.repositories.NotificationRepository;
import com.fikv.heartrateregisterapplication.repositories.ResultRepository;
import com.fikv.heartrateregisterapplication.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResultService {
    private final ResultRepository resultRepository;
    private final UserRepository userRepository;
    private final NotificationRepository notificationRepository;

    public void addResult(ResultDTO resultDTO) {
        Result result = Result.builder().user(userRepository.findById(resultDTO.getUserId()).get())
                .notification(notificationRepository.findById(resultDTO.getNotificationId()).get())
                .diastolic(resultDTO.getDiastolic())
                .systolic(resultDTO.getSystolic())
                .heartRate(resultDTO.getHeartRate())
                .dateOfMeasurement(LocalDate.now()).build();
        resultRepository.save(result);
    }

    public List<Result> getAllResults(SearchDatesDTO searchDatesDTO) {
        Long id = userRepository.findByUsername(searchDatesDTO.getUserName()).getId();
        List<Result> a = resultRepository.findAll();
        return resultRepository.findAll()
                .stream()
                .filter(e -> e.getUser().getId() == 3
                        && e.getDateOfMeasurement().isBefore(searchDatesDTO.getEndDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                        && e.getDateOfMeasurement().isAfter(searchDatesDTO.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()))
                .collect(Collectors.toList());
    }

}
