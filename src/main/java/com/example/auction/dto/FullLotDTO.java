package com.example.auction.dto;

import com.example.auction.enums.LotStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FullLotDTO implements Serializable {
    private int id;

    private LotStatus status;

    private String title;

    private String description;

    private int startPrice;

    private int bidPrice;

    private int currentPrice;

    private BidDTO lastBid;
}
