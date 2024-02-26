package com.nomadcompass.core.usecase;

import com.nomadcompass.infrastructure.input.request.EstimationRequest;

public interface EstimationUseCase {

    void estimate(EstimationRequest estimationRequest);
}
