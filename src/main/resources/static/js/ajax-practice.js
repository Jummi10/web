const LOCALHOST = "http://localhost:8080";

const api = {
  get: async (uri) => await fetch(`${LOCALHOST}/${uri}`, {method: "GET"})
}

const $root = document.getElementById("root");

const renderArticle = ({title, content}) => {
  $root.insertAdjacentHTML("beforeend", `
    <div id="article-container">
      <h2>제목 : ${title}</h2>
      <p>
      ${content}
      </p>
    </div>
  `)
}

const findArticle = async () => {
  const articleId = document.getElementById("article-id").value;
  const response = await api.get(`articles/${articleId}`);
  const body = await response.json();

  renderArticle(body)
}

const merryChristmas = async () => {
  const $month = document.getElementById("month-input");
  const $day = document.getElementById("day-input");
  console.log($month);
  const response = await api.get(`practice/christmas?month=${$month.value}&day=${$day.value}`);
  const body = await response.json();

  alert(body.message);
}

const init = async () => {
  const $button = document.getElementById("btn-submit")
  const $articleButton = document.getElementById("btn-article-submit")
  const response = await api.get("practice/name");
  const body = await response.json();
  $root.insertAdjacentHTML("afterbegin", `<h1>안녕하세요! ${body.name}님!</h1>`)

  $button.addEventListener("click", merryChristmas);
  $articleButton.addEventListener("click", findArticle);
};

init();