<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<style>
h1 {
	text-align: center;
	color: #FF773E;
}

p#top {
	font-size: 18px;
}

p {
	text-align: center;
	padding-bottom: 20px;
}

form {
	text-align: center;
}

span {
	color: red;
	font-weight: bold
}

header {
	border-top: double 10px #8B4513;
}

footer {
	border-bottom: solid 10px #8B4513;
	padding-top: 20px;
	padding-bottom: 10px;
	color: #8B4513;
}
</style>
</head>
<body>
	<header></header>
	<h1>リードタウン朝霞皮フ科</h1>
	<p id="top">ID・パスワードを入力してください</p>

	<form action="../SampleLogin/src/jp.co.aforcr.servlets.login"
		method="post">
		<p>
			ID<input type="text" name="userid" required>パスワード<input
				type="password" name="password" required>
		</p>
		<p>
			<input type="submit" value="ログイン">
		</p>
	</form>
	<p>
		<span>${msg}</span>
	</p>
	<footer></footer>
	<%@include file="../header.html"%>