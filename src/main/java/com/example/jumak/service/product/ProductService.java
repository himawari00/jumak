package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductVo;
import com.example.jumak.mapper.product.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductMapper productMapper;

//    상품 번호 조회
    ProductDto findByNumber(Long productNumber){
        return productMapper.selectByNumber(productNumber)
                .orElseThrow( () -> new IllegalStateException( "상품 조회 결과 없음!"));
    }

//    상품 카테고리로 조회
/*    List<ProductDto> findByCategory(Long productCategoryNumber){
        return Optional.ofNullable(productMapper.selectByCategory(productCategoryNumber))
                .orElseThrow( () -> new IllegalStateException("카테고리 조회 결과 없음!"));
    }*/

//    전체 상품 조회
    List<ProductDto> findAll(){return productMapper.selectAll();}



}
