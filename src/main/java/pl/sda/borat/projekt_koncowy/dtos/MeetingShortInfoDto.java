package pl.sda.borat.projekt_koncowy.dtos;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MeetingShortInfoDto {

    private final Long id;

    private final String title;

    private final LocalDateTime sinceDate;

    private final LocalDateTime toDate;

    private final String body;

    public MeetingShortInfoDto(Long id, String title, LocalDateTime sinceDate, LocalDateTime toDate, String body) {
        this.id = id;
        this.title = title;
        this.sinceDate = sinceDate;
        this.toDate = toDate;
        this.body = body;
    }
}
