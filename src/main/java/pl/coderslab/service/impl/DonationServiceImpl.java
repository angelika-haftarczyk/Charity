package pl.coderslab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.repository.DonationRepository;
import pl.coderslab.service.DonationService;

@Service
public class DonationServiceImpl implements DonationService {

    @Autowired
    DonationRepository donationRepository;

    @Override
    public long donationCount() {
        return donationRepository.count();
    }

    @Override
    public long getSumQuantity() {
        return donationRepository.selectSumQuantity();
    }
}
