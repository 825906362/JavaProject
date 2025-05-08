<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>代码解析可视化</title>
  <script src="https://cdn.tailwindcss.com"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
  <style>
    body {
      font-family: 'Inter', -apple-system, BlinkMacSystemFont, sans-serif;
      background-color: #f9fafb;
      color: #111827;
    }
    .code-block {
      background-color: #1e293b;
      color: #f8fafc;
      border-radius: 0.5rem;
      overflow-x: auto;
    }
    .card {
      transition: all 0.2s ease;
      box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05);
    }
    .card:hover {
      transform: translateY(-2px);
      box-shadow: 0 20px 25px -5px rgba(0, 0, 0, 0.1), 0 10px 10px -5px rgba(0, 0, 0, 0.04);
    }
    .highlight {
      position: relative;
    }
    .highlight:after {
      content: '';
      position: absolute;
      left: 0;
      bottom: 0;
      width: 100%;
      height: 30%;
      background-color: rgba(167, 139, 250, 0.2);
      z-index: -1;
      transition: all 0.2s ease;
    }
  </style>
</head>
<body class="antialiased">
<div class="max-w-4xl mx-auto px-4 py-8 sm:px-6 lg:px-8">
  <!-- 标题部分 -->
  <div class="text-center mb-12">
    <h1 class="text-3xl font-bold text-gray-900 sm:text-4xl mb-4">代码解析可视化</h1>
    <p class="text-lg text-gray-600 max-w-2xl mx-auto">深入理解HTML表单与JavaScript验证的实现原理</p>
  </div>

  <!-- HTML表单部分 -->
  <div class="mb-16">
    <div class="flex items-center mb-6">
      <div class="w-8 h-8 rounded-full bg-indigo-600 flex items-center justify-center mr-3">
        <i class="fas fa-code text-white text-sm"></i>
      </div>
      <h2 class="text-2xl font-semibold text-gray-800">HTML表单部分</h2>
    </div>

    <div class="code-block p-4 mb-6">
                <pre class="text-sm"><code>&lt;%--跳转输入框--%&gt;
&lt;form onsubmit="return validatePageInput(event)" class="d-flex gap-2"&gt;
  &lt;input
    type="text"
    name="pageNum"
    class="form-control text-center"
    style="width: 60px"
    placeholder="页码"
    value="${pageNum}"
  &gt;
  &lt;button type="submit" class="btn btn-success"&gt;跳转&lt;/button&gt;
&lt;/form&gt;</code></pre>
    </div>

    <div class="grid gap-4 md:grid-cols-2">
      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">代码行解析</h3>
        <div class="space-y-4">
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">&lt;%--跳转输入框--%&gt;</div>
            <p class="text-gray-700">JSP注释，注释内容不会渲染到页面，仅开发者可见。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">&lt;form onsubmit="return validatePageInput(event)" ...&gt;</div>
            <p class="text-gray-700">表单提交时触发 <span class="font-mono text-indigo-600">validatePageInput(event)</span> 函数，<span class="font-mono text-indigo-600">return</span> 表示根据函数返回值决定是否提交。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">class="d-flex gap-2"</div>
            <p class="text-gray-700">Bootstrap样式类：<span class="font-mono text-indigo-600">d-flex</span> 启用弹性布局，<span class="font-mono text-indigo-600">gap-2</span> 设置子元素间距。</p>
          </div>
        </div>
      </div>

      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">代码行解析</h3>
        <div class="space-y-4">
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">type="text"</div>
            <p class="text-gray-700">输入框类型为普通文本（后续可优化为 <span class="font-mono text-indigo-600">type="number"</span>）。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">name="pageNum"</div>
            <p class="text-gray-700">输入框的请求参数名，提交后后端通过 <span class="font-mono text-indigo-600">pageNum</span> 接收值。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">value="${pageNum}"</div>
            <p class="text-gray-700">JSP表达式，从服务器端获取当前页码并填充到输入框。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">&lt;button type="submit"&gt;</div>
            <p class="text-gray-700">提交按钮，点击会触发表单提交。</p>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- JavaScript验证部分 -->
  <div class="mb-16">
    <div class="flex items-center mb-6">
      <div class="w-8 h-8 rounded-full bg-indigo-600 flex items-center justify-center mr-3">
        <i class="fab fa-js text-white text-sm"></i>
      </div>
      <h2 class="text-2xl font-semibold text-gray-800">JavaScript验证部分</h2>
    </div>

    <div class="code-block p-4 mb-6">
                <pre class="text-sm"><code>&lt;script&gt;
  function validatePageInput(event) {
    const inputPage = document.querySelector("input[name='pageNum']").value;
    const totalPage = ${totalPage};

    // 校验非数字输入
    if (isNaN(inputPage) || inputPage.trim() === "") {
      alert("请输入有效数字！");
      event.preventDefault();
      return false;
    }

    // 校验范围
    const pageNum = parseInt(inputPage);
    if (pageNum < 1 || pageNum > totalPage) {
      alert(`页码无效，请输入 1-${totalPage} 之间的值！`);
      event.preventDefault();
      return false;
    }
    return true;
  }
&lt;/script&gt;</code></pre>
    </div>

    <div class="grid gap-4 md:grid-cols-2">
      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">代码行解析</h3>
        <div class="space-y-4">
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">function validatePageInput(event)</div>
            <p class="text-gray-700">定义表单提交时的验证函数，<span class="font-mono text-indigo-600">event</span> 参数包含事件信息。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">const inputPage = ...</div>
            <p class="text-gray-700">通过CSS选择器获取 <span class="font-mono text-indigo-600">name="pageNum"</span> 的输入框的值。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">const totalPage = ${totalPage}</div>
            <p class="text-gray-700 font-semibold">关键行：使用JSP表达式 <span class="font-mono text-indigo-600">${totalPage}</span> 将服务器端计算的总页数注入到JavaScript中。</p>
          </div>
        </div>
      </div>

      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">代码行解析</h3>
        <div class="space-y-4">
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">if (isNaN(inputPage) ...)</div>
            <p class="text-gray-700">检查输入是否为非数字或空字符串。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">alert("请输入有效数字！")</div>
            <p class="text-gray-700">弹窗提示错误信息。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">event.preventDefault()</div>
            <p class="text-gray-700">阻止表单默认提交行为（页面跳转或刷新）。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">return false</div>
            <p class="text-gray-700">返回 <span class="font-mono text-indigo-600">false</span> 明确阻止表单提交。</p>
          </div>
        </div>
      </div>

      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">代码行解析</h3>
        <div class="space-y-4">
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">const pageNum = parseInt(inputPage)</div>
            <p class="text-gray-700">将输入值转为整数。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">if (pageNum < 1 ...)</div>
            <p class="text-gray-700">检查页码是否在 <span class="font-mono text-indigo-600">1</span> 到 <span class="font-mono text-indigo-600">totalPage</span> 之间。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">alert(`页码无效...`)</div>
            <p class="text-gray-700">使用模板字符串动态提示页码范围。</p>
          </div>
          <div>
            <div class="font-mono text-sm bg-gray-100 px-2 py-1 rounded inline-block mb-1">return true</div>
            <p class="text-gray-700">验证通过，允许表单提交。</p>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- 关键注意事项 -->
  <div class="mb-16">
    <div class="flex items-center mb-6">
      <div class="w-8 h-8 rounded-full bg-indigo-600 flex items-center justify-center mr-3">
        <i class="fas fa-exclamation-triangle text-white text-sm"></i>
      </div>
      <h2 class="text-2xl font-semibold text-gray-800">关键注意事项</h2>
    </div>

    <div class="space-y-6">
      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">1. EL表达式 ${totalPage} 的注入</h3>
        <ul class="list-disc pl-5 space-y-2 text-gray-700">
          <li>必须确保服务器端已正确传递 <span class="font-mono text-indigo-600">totalPage</span> 参数，否则JavaScript会报错。</li>
          <li>如果 <span class="font-mono text-indigo-600">totalPage</span> 未定义，代码会直接中断。</li>
        </ul>
      </div>

      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">2. 输入类型隐患</h3>
        <p class="text-gray-700 mb-4">当前使用 <span class="font-mono text-indigo-600">type="text"</span>，用户可输入非数字字符（如 <span class="font-mono text-indigo-600">12a</span>），建议改为 <span class="font-mono text-indigo-600">type="number"</span> 限制输入类型。</p>
        <p class="text-gray-700 font-medium mb-2">改进方案：</p>
        <div class="code-block p-4">
                        <pre class="text-sm"><code>&lt;input
  type="number"
  name="pageNum"
  min="1"
  max="${totalPage}"
  onkeypress="return event.charCode >= 48 && event.charCode <= 57"
&gt;</code></pre>
        </div>
      </div>

      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">3. 后端防御性校验必要性</h3>
        <p class="text-gray-700 mb-4">客户端校验可被绕过（如禁用JavaScript），需在后端Controller中再次校验参数合法性：</p>
        <div class="code-block p-4">
                        <pre class="text-sm"><code>@GetMapping("/post2")
public String post2(
    @RequestParam(defaultValue = "1") int pageNum,
    Model model
) {
    if (pageNum < 1 || pageNum > totalPage) {
        model.addAttribute("error", "页码无效");
        return "error-page";
    }
    // 正常业务逻辑
}</code></pre>
        </div>
      </div>

      <div class="card bg-white p-6 rounded-lg">
        <h3 class="font-medium text-lg text-gray-800 mb-3">4. 用户体验优化</h3>
        <p class="text-gray-700">可将原生 <span class="font-mono text-indigo-600">alert</span> 替换为 Bootstrap Toast 或 SweetAlert2 实现更友好的提示。</p>
      </div>
    </div>
  </div>

  <!-- 总结部分 -->
  <div class="bg-indigo-50 rounded-xl p-6 mb-8">
    <div class="flex items-start">
      <div class="flex-shrink-0">
        <div class="w-10 h-10 rounded-full bg-indigo-100 flex items-center justify-center">
          <i class="fas fa-lightbulb text-indigo-600"></i>
        </div>
      </div>
      <div class="ml-4">
        <h3 class="text-lg font-medium text-indigo-800 mb-2">总结</h3>
        <p class="text-indigo-700">通过逐行解析，可清晰理解代码逻辑和潜在改进点。本示例展示了HTML表单与JavaScript验证的完整实现，包括前端验证、后端交互和用户体验优化建议。</p>
      </div>
    </div>
  </div>

  <!-- 页脚 -->
  <div class="text-center text-sm text-gray-500 mt-12">
    <p>网页由问小白生成，仅供参考</p>
    <p class="mt-1">最后更新时间为2025-05-08 ，星期四</p>
    <p class="mt-1"><a href="https://wenxiaobai.com" class="text-indigo-600 hover:text-indigo-800">wenxiaobai.com</a></p>
  </div>
</div>

<script>
  // 平滑滚动效果
  document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
      e.preventDefault();
      document.querySelector(this.getAttribute('href')).scrollIntoView({
        behavior: 'smooth'
      });
    });
  });
</script>
</body>
</html>