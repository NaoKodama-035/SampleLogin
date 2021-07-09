<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>病院ホームページ</title>

<style type="text/css">
h1, p#name, li, footer {
	text-align: center;
}

p#name {
	color: #8B4513;
	font-size: 20px;
}

h1 {
	color: #FF773E;
}

li {
	list-style: none;
	width: 33%;
	float: left;
}

li a {
	color: #8B4513;
}

li a:hover {
	text-decoration: none;
}

ul:after {
	content: "";
	display: block;
	clear: both;
}

ul {
	padding: 0;
}

header {
	border-top: double 10px #8B4513;
}

div {
	width: 640px;
	margin-right: auto;
	margin-left: auto;
}

h2 {
	text-align: center;
	padding: 1rem 2rem;
	background: #FF773E;
}

h2 a {
	color: white;
}

h2 a:hover {
	text-decoration: none;
}

img {
	max-width: 100%;
	border-radius: 6px;
}

footer {
	font-size: 25px;
	border-bottom: solid 10px #8B4513;
	padding-top: 20px;
	padding-bottom: 10px;
	color: #8B4513;
}
</style>
</head>
<body>
	<header>
		<h1>あさかリードタウン皮フ科</h1>
		<p id="name">ようこそ、${members.name}さん！</p>
	</header>
	<nav>
		<ul>
			<li><a href="${pageContext.request.contextPath}/html/time.html">診療時間</a></li>
			<li><a href="login-out.jsp">ホーム</a></li>
			<li><a
				href="${pageContext.request.contextPath}/html/access.html">アクセス</a></li>
		</ul>
	</nav>
	<div>
		<main>
			<p>
				<img src="${pageContext.request.contextPath}/image/asaka.jpg"
					alt="外観写真">
			</p>
			<section>
				<h2>
					<a href="${pageContext.request.contextPath}/html/reserve.html">WEB予約</a>
				</h2>
			</section>
		</main>
	</div>
	<footer> ☎048-123-4567 </footer>
</body>
</html>