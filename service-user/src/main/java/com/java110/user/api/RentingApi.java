package com.java110.user.api;

import com.alibaba.fastjson.JSONObject;
import com.java110.dto.rentingConfig.RentingConfigDto;
import com.java110.dto.rentingPool.RentingPoolDto;
import com.java110.dto.rentingPoolAttr.RentingPoolAttrDto;
import com.java110.po.rentingConfig.RentingConfigPo;
import com.java110.po.rentingPool.RentingPoolPo;
import com.java110.po.rentingPoolAttr.RentingPoolAttrPo;
import com.java110.user.bmo.rentingConfig.IDeleteRentingConfigBMO;
import com.java110.user.bmo.rentingConfig.IGetRentingConfigBMO;
import com.java110.user.bmo.rentingConfig.ISaveRentingConfigBMO;
import com.java110.user.bmo.rentingConfig.IUpdateRentingConfigBMO;
import com.java110.user.bmo.rentingPool.IDeleteRentingPoolBMO;
import com.java110.user.bmo.rentingPool.IGetRentingPoolBMO;
import com.java110.user.bmo.rentingPool.ISaveRentingPoolBMO;
import com.java110.user.bmo.rentingPool.IUpdateRentingPoolBMO;
import com.java110.user.bmo.rentingPoolAttr.IDeleteRentingPoolAttrBMO;
import com.java110.user.bmo.rentingPoolAttr.IGetRentingPoolAttrBMO;
import com.java110.user.bmo.rentingPoolAttr.ISaveRentingPoolAttrBMO;
import com.java110.user.bmo.rentingPoolAttr.IUpdateRentingPoolAttrBMO;
import com.java110.utils.util.Assert;
import com.java110.utils.util.BeanConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/renting")
public class RentingApi {

    @Autowired
    private ISaveRentingConfigBMO saveRentingConfigBMOImpl;
    @Autowired
    private IUpdateRentingConfigBMO updateRentingConfigBMOImpl;
    @Autowired
    private IDeleteRentingConfigBMO deleteRentingConfigBMOImpl;

    @Autowired
    private IGetRentingConfigBMO getRentingConfigBMOImpl;


    @Autowired
    private ISaveRentingPoolBMO saveRentingPoolBMOImpl;
    @Autowired
    private IUpdateRentingPoolBMO updateRentingPoolBMOImpl;
    @Autowired
    private IDeleteRentingPoolBMO deleteRentingPoolBMOImpl;

    @Autowired
    private IGetRentingPoolBMO getRentingPoolBMOImpl;

    @Autowired
    private ISaveRentingPoolAttrBMO saveRentingPoolAttrBMOImpl;
    @Autowired
    private IUpdateRentingPoolAttrBMO updateRentingPoolAttrBMOImpl;
    @Autowired
    private IDeleteRentingPoolAttrBMO deleteRentingPoolAttrBMOImpl;

    @Autowired
    private IGetRentingPoolAttrBMO getRentingPoolAttrBMOImpl;

    /**
     * 微信保存消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/saveRentingConfig
     * @path /app/renting/saveRentingConfig
     */
    @RequestMapping(value = "/saveRentingConfig", method = RequestMethod.POST)
    public ResponseEntity<String> saveRentingConfig(@RequestBody JSONObject reqJson) {

        Assert.hasKeyAndValue(reqJson, "rentingType", "请求报文中未包含rentingType");
        Assert.hasKeyAndValue(reqJson, "rentingFormula", "请求报文中未包含rentingFormula");
        Assert.hasKeyAndValue(reqJson, "servicePrice", "请求报文中未包含servicePrice");
        Assert.hasKeyAndValue(reqJson, "serviceOwnerRate", "请求报文中未包含serviceOwnerRate");
        Assert.hasKeyAndValue(reqJson, "serviceTenantRate", "请求报文中未包含serviceTenantRate");
        Assert.hasKeyAndValue(reqJson, "adminSeparateRate", "请求报文中未包含adminSeparateRate");
        Assert.hasKeyAndValue(reqJson, "proxySeparateRate", "请求报文中未包含proxySeparateRate");
        Assert.hasKeyAndValue(reqJson, "propertySeparateRate", "请求报文中未包含propertySeparateRate");


        RentingConfigPo rentingConfigPo = BeanConvertUtil.covertBean(reqJson, RentingConfigPo.class);
        return saveRentingConfigBMOImpl.save(rentingConfigPo);
    }

    /**
     * 微信修改消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/updateRentingConfig
     * @path /app/renting/updateRentingConfig
     */
    @RequestMapping(value = "/updateRentingConfig", method = RequestMethod.POST)
    public ResponseEntity<String> updateRentingConfig(@RequestBody JSONObject reqJson) {

        Assert.hasKeyAndValue(reqJson, "rentingType", "请求报文中未包含rentingType");
        Assert.hasKeyAndValue(reqJson, "rentingFormula", "请求报文中未包含rentingFormula");
        Assert.hasKeyAndValue(reqJson, "servicePrice", "请求报文中未包含servicePrice");
        Assert.hasKeyAndValue(reqJson, "serviceOwnerRate", "请求报文中未包含serviceOwnerRate");
        Assert.hasKeyAndValue(reqJson, "serviceTenantRate", "请求报文中未包含serviceTenantRate");
        Assert.hasKeyAndValue(reqJson, "adminSeparateRate", "请求报文中未包含adminSeparateRate");
        Assert.hasKeyAndValue(reqJson, "proxySeparateRate", "请求报文中未包含proxySeparateRate");
        Assert.hasKeyAndValue(reqJson, "propertySeparateRate", "请求报文中未包含propertySeparateRate");
        Assert.hasKeyAndValue(reqJson, "rentingConfigId", "rentingConfigId不能为空");


        RentingConfigPo rentingConfigPo = BeanConvertUtil.covertBean(reqJson, RentingConfigPo.class);
        return updateRentingConfigBMOImpl.update(rentingConfigPo);
    }

    /**
     * 微信删除消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/deleteRentingConfig
     * @path /app/renting/deleteRentingConfig
     */
    @RequestMapping(value = "/deleteRentingConfig", method = RequestMethod.POST)
    public ResponseEntity<String> deleteRentingConfig(@RequestBody JSONObject reqJson) {
        Assert.hasKeyAndValue(reqJson, "communityId", "小区ID不能为空");

        Assert.hasKeyAndValue(reqJson, "rentingConfigId", "rentingConfigId不能为空");


        RentingConfigPo rentingConfigPo = BeanConvertUtil.covertBean(reqJson, RentingConfigPo.class);
        return deleteRentingConfigBMOImpl.delete(rentingConfigPo);
    }

    /**
     * 微信删除消息模板
     *
     * @return
     * @serviceCode /renting/queryRentingConfig
     * @path /app/renting/queryRentingConfig
     */
    @RequestMapping(value = "/queryRentingConfig", method = RequestMethod.GET)
    public ResponseEntity<String> queryRentingConfig(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "row") int row) {
        RentingConfigDto rentingConfigDto = new RentingConfigDto();
        rentingConfigDto.setPage(page);
        rentingConfigDto.setRow(row);
        return getRentingConfigBMOImpl.get(rentingConfigDto);
    }


    /**
     * 微信保存消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/saveRentingPool
     * @path /app/renting/saveRentingPool
     */
    @RequestMapping(value = "/saveRentingPool", method = RequestMethod.POST)
    public ResponseEntity<String> saveRentingPool(@RequestBody JSONObject reqJson) {

        Assert.hasKeyAndValue(reqJson, "rentingTitle", "请求报文中未包含rentingTitle");
        Assert.hasKeyAndValue(reqJson, "roomId", "请求报文中未包含roomId");
        Assert.hasKeyAndValue(reqJson, "communityId", "请求报文中未包含communityId");
        Assert.hasKeyAndValue(reqJson, "price", "请求报文中未包含price");
        Assert.hasKeyAndValue(reqJson, "paymentType", "请求报文中未包含paymentType");
        Assert.hasKeyAndValue(reqJson, "checkInDate", "请求报文中未包含checkInDate");
        Assert.hasKeyAndValue(reqJson, "rentingConfigId", "请求报文中未包含rentingConfigId");
        Assert.hasKeyAndValue(reqJson, "ownerName", "请求报文中未包含ownerName");
        Assert.hasKeyAndValue(reqJson, "ownerTel", "请求报文中未包含ownerTel");


        RentingPoolPo rentingPoolPo = BeanConvertUtil.covertBean(reqJson, RentingPoolPo.class);
        return saveRentingPoolBMOImpl.save(rentingPoolPo);
    }

    /**
     * 微信修改消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/updateRentingPool
     * @path /app/renting/updateRentingPool
     */
    @RequestMapping(value = "/updateRentingPool", method = RequestMethod.POST)
    public ResponseEntity<String> updateRentingPool(@RequestBody JSONObject reqJson) {

        Assert.hasKeyAndValue(reqJson, "rentingTitle", "请求报文中未包含rentingTitle");
        Assert.hasKeyAndValue(reqJson, "roomId", "请求报文中未包含roomId");
        Assert.hasKeyAndValue(reqJson, "communityId", "请求报文中未包含communityId");
        Assert.hasKeyAndValue(reqJson, "price", "请求报文中未包含price");
        Assert.hasKeyAndValue(reqJson, "paymentType", "请求报文中未包含paymentType");
        Assert.hasKeyAndValue(reqJson, "checkInDate", "请求报文中未包含checkInDate");
        Assert.hasKeyAndValue(reqJson, "rentingConfigId", "请求报文中未包含rentingConfigId");
        Assert.hasKeyAndValue(reqJson, "ownerName", "请求报文中未包含ownerName");
        Assert.hasKeyAndValue(reqJson, "ownerTel", "请求报文中未包含ownerTel");
        Assert.hasKeyAndValue(reqJson, "rentingId", "rentingId不能为空");


        RentingPoolPo rentingPoolPo = BeanConvertUtil.covertBean(reqJson, RentingPoolPo.class);
        return updateRentingPoolBMOImpl.update(rentingPoolPo);
    }

    /**
     * 微信删除消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/deleteRentingPool
     * @path /app/renting/deleteRentingPool
     */
    @RequestMapping(value = "/deleteRentingPool", method = RequestMethod.POST)
    public ResponseEntity<String> deleteRentingPool(@RequestBody JSONObject reqJson) {
        Assert.hasKeyAndValue(reqJson, "communityId", "小区ID不能为空");

        Assert.hasKeyAndValue(reqJson, "rentingId", "rentingId不能为空");


        RentingPoolPo rentingPoolPo = BeanConvertUtil.covertBean(reqJson, RentingPoolPo.class);
        return deleteRentingPoolBMOImpl.delete(rentingPoolPo);
    }

    /**
     * 微信删除消息模板
     *
     * @param communityId 小区ID
     * @return
     * @serviceCode /renting/queryRentingPool
     * @path /app/renting/queryRentingPool
     */
    @RequestMapping(value = "/queryRentingPool", method = RequestMethod.GET)
    public ResponseEntity<String> queryRentingPool(@RequestParam(value = "communityId") String communityId,
                                                   @RequestParam(value = "page") int page,
                                                   @RequestParam(value = "row") int row) {
        RentingPoolDto rentingPoolDto = new RentingPoolDto();
        rentingPoolDto.setPage(page);
        rentingPoolDto.setRow(row);
        rentingPoolDto.setCommunityId(communityId);
        return getRentingPoolBMOImpl.get(rentingPoolDto);
    }


    /**
     * 微信保存消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/saveRentingPoolAttr
     * @path /app/renting/saveRentingPoolAttr
     */
    @RequestMapping(value = "/saveRentingPoolAttr", method = RequestMethod.POST)
    public ResponseEntity<String> saveRentingPoolAttr(@RequestBody JSONObject reqJson) {

        Assert.hasKeyAndValue(reqJson, "rentingId", "请求报文中未包含rentingId");
        Assert.hasKeyAndValue(reqJson, "specCd", "请求报文中未包含specCd");


        RentingPoolAttrPo rentingPoolAttrPo = BeanConvertUtil.covertBean(reqJson, RentingPoolAttrPo.class);
        return saveRentingPoolAttrBMOImpl.save(rentingPoolAttrPo);
    }

    /**
     * 微信修改消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/updateRentingPoolAttr
     * @path /app/renting/updateRentingPoolAttr
     */
    @RequestMapping(value = "/updateRentingPoolAttr", method = RequestMethod.POST)
    public ResponseEntity<String> updateRentingPoolAttr(@RequestBody JSONObject reqJson) {

        Assert.hasKeyAndValue(reqJson, "rentingId", "请求报文中未包含rentingId");
        Assert.hasKeyAndValue(reqJson, "specCd", "请求报文中未包含specCd");
        Assert.hasKeyAndValue(reqJson, "attrId", "attrId不能为空");


        RentingPoolAttrPo rentingPoolAttrPo = BeanConvertUtil.covertBean(reqJson, RentingPoolAttrPo.class);
        return updateRentingPoolAttrBMOImpl.update(rentingPoolAttrPo);
    }

    /**
     * 微信删除消息模板
     *
     * @param reqJson
     * @return
     * @serviceCode /renting/deleteRentingPoolAttr
     * @path /app/renting/deleteRentingPoolAttr
     */
    @RequestMapping(value = "/deleteRentingPoolAttr", method = RequestMethod.POST)
    public ResponseEntity<String> deleteRentingPoolAttr(@RequestBody JSONObject reqJson) {
        Assert.hasKeyAndValue(reqJson, "communityId", "小区ID不能为空");

        Assert.hasKeyAndValue(reqJson, "attrId", "attrId不能为空");


        RentingPoolAttrPo rentingPoolAttrPo = BeanConvertUtil.covertBean(reqJson, RentingPoolAttrPo.class);
        return deleteRentingPoolAttrBMOImpl.delete(rentingPoolAttrPo);
    }

    /**
     * 微信删除消息模板
     *
     * @param communityId 小区ID
     * @return
     * @serviceCode /renting/queryRentingPoolAttr
     * @path /app/renting/queryRentingPoolAttr
     */
    @RequestMapping(value = "/queryRentingPoolAttr", method = RequestMethod.GET)
    public ResponseEntity<String> queryRentingPoolAttr(@RequestParam(value = "communityId") String communityId,
                                                       @RequestParam(value = "page") int page,
                                                       @RequestParam(value = "row") int row) {
        RentingPoolAttrDto rentingPoolAttrDto = new RentingPoolAttrDto();
        rentingPoolAttrDto.setPage(page);
        rentingPoolAttrDto.setRow(row);
        rentingPoolAttrDto.setCommunityId(communityId);
        return getRentingPoolAttrBMOImpl.get(rentingPoolAttrDto);
    }
}