<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" 	   uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0, user-scalable=no"/>
	<title>Crawling Test</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/css/error.css" />
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-12">
				<div class="error-template">
					<h1>죄송합니다.</h1>
					<h2>에러</h2>
					<div class="error-actions">						
						<a href="javascript:void(0)" onclick="history.back(-1)" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-arrow-left"></span> 이전페이지</a>
						<a href="/main" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-home"></span> 메인화면</a>
					</div>
				</div>
			</div>
	    </div>
	</div>
</body>