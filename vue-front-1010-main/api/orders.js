import request from '@/utils/request'

export default {
    //生成订单
    createOrders(courseId) {
        return request({
            url: '/orderservice/order/createOrder/' + courseId,
            method: 'post'
        })
    },
    //根据订单id查询订单信息
    getOrdersInfo(id) {
        return request({
            url: '/orderservice/order/getOrder/' + id,
            method: 'get'
        })
    },
    //生成二维码的方法
    createNatvie(orderNo) {
        return request({
            url: '/orderservice/log/createNative/' + orderNo,
            method: 'get'
        })
    },

    //查询订单状态的方法
    //生成二维码的方法
    queryPayStatus(orderNo) {
        return request({
            url: '/orderservice/log/queryPayStatus/' + orderNo,
            method: 'get'
        })
    }
}