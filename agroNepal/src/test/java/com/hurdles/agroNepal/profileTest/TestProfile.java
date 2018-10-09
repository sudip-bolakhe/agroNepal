package com.hurdles.agroNepal.profileTest;

import com.hurdles.agroNepal.controller.ProfileController;
import com.hurdles.agroNepal.model.Profile;
import com.hurdles.agroNepal.repository.ProfileRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestProfile {

    @Mock
    ProfileRepository profileRepository;

    @InjectMocks
    ProfileController profileController;

    @Test
    public void test(){
        Profile profile= new Profile();

    }
}
