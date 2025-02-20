# SPay-Ali-Demo

这是一个基于 SPay-Ali 支付库的支付宝支付集成示例项目。

## 项目介绍

本项目展示了如何使用 SPay-Ali 库快速集成支付宝支付功能，包含了常用的支付场景示例。

## 技术栈

- Java 17
- Spring Boot 3.4.0
- SPay-Ali 1.0.0
- Lombok
- Hutool
- Enjoy Template Engine

## 快速开始

### 环境要求

- JDK 17+
- SpringBoot 3.x

### 配置说明

1. 在 `pom.xml` 中添加依赖：

```xml
<dependency>
    <groupId>top.videoboy.pay</groupId>
    <artifactId>spay-ali</artifactId>
    <version>1.0.0</version>
</dependency>
```

2. 在 `alipay.properties` 中配置支付宝相关参数：
```properties
# 支付宝应用ID
alipay.appId=your_app_id
alipay.privateKey=your_private_key
alipay.publicKey=your_public_key
alipay.appCertPath=your_app_cert_path
alipay.aliPayCertPath=your_ali_pay_cert_path
alipay.aliPayRootCertPath=your_ali_pay_root_cert_path
alipay.serverUrl=your_server_url
alipay.domain=your_domain
```

