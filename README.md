es_maven
========
1.	测试该框架需要有依赖服务
	1.1 elasticsearch-rtf
		GitHub:https://github.com/medcl/elasticsearch-rtf
		启动elasticsearch后进入http://localhost:9200/_plugin/rtf/ 
		点击New Index ,名称为es_search
	1.2 Oracle
	存在表p_product[id,name]
	存在表p_brand[id,name]
2.	启动脚本
	在项目根目录执行：jettyTest.bat
3.	初始化数据

es_demo