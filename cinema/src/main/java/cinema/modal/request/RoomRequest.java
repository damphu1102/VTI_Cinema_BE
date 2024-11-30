package cinema.modal.request;

import lombok.Data;

@Data
public class RoomRequest {
    private String name;
    private int cinemaId;
    private int showTimeId;
    private String screenType;
}
