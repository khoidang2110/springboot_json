package com.cybersoft.demoapi08.config;

import com.cybersoft.demoapi08.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Configuration
public class ProductConfig {

    //khai báo class gán sẵn giá trị và đưa lên IOC lưu trữ
    @Bean
    public List<ProductEntity> productList() {
        return List.of(
                new ProductEntity(1L, "Camera IP 360", 470000, 650000, "-27%", 4.9, List.of("img1.jpg", "img2.jpg"), 1),
                new ProductEntity(2L, "Camera Wifi", 550000, 750000, "-26%", 4.8, List.of("img3.jpg", "img4.jpg"), 1),
                new ProductEntity(3L, "Đèn thông minh", 300000, 450000, "-33%", 4.7, List.of("img5.jpg"), 2),
                new ProductEntity(4L, "Khóa vân tay", 1200000, 1500000, "-20%", 4.5, List.of("img6.jpg"), 2)
        );
    }



    @Bean
    public Map<Integer, String> categoryMap() { // Đổi Long -> Integer
        return Map.of(
                1, "camera-quan-sat",
                2, "nha-thong-minh"
        );
    }

    @Bean
    public List<PromotionEntity> promotionList() {
        return List.of(
                    new PromotionEntity(1, "Hỗ trợ chuyển đổi Esim"),
                    new PromotionEntity(2, "Ưu đãi tới 1.0500.000Đ")
            );
    }
    @Bean
    public List<CityEntity> cityList() {
        return List.of(
                new CityEntity(1, "Hà Nội"),
                new CityEntity(2, "HCM")
        );
    }

    @Bean
    public List<ShowroomEntity> showroomList() {
        return List.of(
                new ShowroomEntity(1, 1,"199 Quang Trung - P.Quang Trung - Q.Hà Đông - TP.Hà Nội"),
                new ShowroomEntity(2, 1,"117 xã đàn Phương Liên Đống Đa - TP.Hà Nội")
        );
    }

    @Bean
    public List<PriceEntity> priceList() {
        return List.of(
                new PriceEntity(1, "Gray",5250000,5430000,List.of("img1.jpg", "img2.jpg")),
                new PriceEntity(1, "Blue",6000000,5500000,List.of("img344.jpg", "img244.jpg"))
        );
    }

    @Bean
    public ProductDetailEntity productDetailEntity(
            List<PriceEntity> priceList,
            List<PromotionEntity> promotionList,
            List<CityEntity> cityList,
            List<ShowroomEntity> showroomList) {
        return new ProductDetailEntity(
                1,
                3,
                "Điện thoại Tecno Pova 6",
                4.5,
                12,
                priceList,
                promotionList,
                cityList,
                showroomList
        );
    }

}
