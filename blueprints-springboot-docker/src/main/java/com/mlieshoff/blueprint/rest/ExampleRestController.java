package com.mlieshoff.blueprint.rest;

import com.mlieshoff.blueprint.service.ExampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ExampleRestController {

    private final ExampleService exampleService;

    @Operation(summary = "Displays a list of examples")
    @ApiResponses(
            value = {
                @ApiResponse(
                        responseCode = "200",
                        description = "A list of examples",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ExampleRestDto.class))
                        })
            })
    @GetMapping(value = "examples/list", produces = "application/json")
    public List<ExampleRestDto> listExamples() {
        return exampleService.list().stream().map(ExampleRestMapper.INSTANCE::exampleServiceDtoToExampleRestDto)
                .toList();
    }
}
