//分页总记录数
var totalRecord,currentPage;
   
window.onload=function(){
    	to_page(1);
    	
    }
    
    function to_page(pn){
    	$.ajax({
    		url:"reserveAgentAll",
    		data:"pn="+pn,
    		type:"get",
    		success:function(result){
    			
    			
    			//console.log(result);
    			var user =result.users;
    			if(user==null){
    				alert("您还没有登陆!");
    			}else if (user!=null) {
					
    			/* 用户账号模板替换 */
    		    if(user!=null){
    			var userLi=document.getElementById('user_li');
                var uHTML=template('user_tpl',result)
                    userLi.innerHTML=uHTML;
    		    }else {
    		    	var userLi=document.getElementById('user_li');
                    var uHTML=template('user_tpl2',result)
                    userLi.innerHTML=uHTML;
					
				}
    			
    			
    			totalRecord = result.extend.reserveAgent.total;
    			currentPage = result.extend.reserveAgent.pageNum;
    			//展示预加盟商的申请人数据
    			var agent = result.extend.reserveAgent.list;
    		    	result.list=agent;
    			    var table_tbody=document.getElementById('tbodys');
    		        var sHTML = template('reserve_agent',result)
    		        table_tbody.innerHTML=sHTML;
    		        
    		    var results = result.extend.reserveAgent;
                    
                 /* 分页条数据展示替换模板 */
                var pages=document.getElementById('paging');
                	var pHTML=template('page',results)
                    pages.innerHTML=pHTML;   
                
                var tables=document.getElementById('nav_ul');
                    var tHTMLs=template('ul_li',results)
                    tables.innerHTML=tHTMLs;
                    
                
                	
                    build_page_nav(result);
    		    
                
           	}
    		}
    	});
    	
    	
    }
   
    //分页条按钮
    function build_page_nav(result){
		   
    	
    	
		   var firstPageLi=$('#first_page');
		   var prePageLi =$('#previous_page');
		   
		   if(result.extend.reserveAgent.hasPreviousPage == false){
			   firstPageLi.addClass("disabled");
			   prePageLi.addClass("disabled");
			   
		   }else{
			 //为元素添加点击翻页的事件 
			    firstPageLi.click(function() {
					to_page(1);
				});
				prePageLi.click(function() {
					to_page(result.extend.reserveAgent.pageNum - 1);

				});
		   }
		   
		   var nextPageLi=$('#next_page');
		   var lastPageLi =$('#last_page');
		   
		   if(result.extend.reserveAgent.hasNextPage==false){
			   nextPageLi.addClass("disabled");
			   lastPageLi.addClass("disabled");
			   
		   }else{
			   
			 //为元素添加点击翻页的事件 
			 	nextPageLi.click(function() {
					to_page(result.extend.reserveAgent.pageNum + 1);
				});
			 	
				lastPageLi.click(function() {
					to_page(result.extend.reserveAgent.pages);
				});
				
			   
		   }
		   
	       	//ul中的页码提示			
		    var numLi = $(".lis");
		   /*  console.log(numLi); */
		    numLi.click(function() {
				to_page($(this).data('number'));
				/* console.log($(this).data('number')); */
			}); 

	
             //点击查看弹出模态框且查看数据
             var btnSee=$(".see_btn");
             btnSee.click(function(){
            	 getAgent($(this).data("see"));
            	 
            	// console.log($(this).data("see"));
            	 $("#empUpdateModal").modal({
         			backdrop : "static"
         	 	//getAgent($(this).data("see"));
         		});
             });
      	     
             
             
             //根据id获取agent的数据
             function getAgent(id){
            	   $.ajax({
            		   url:"getAgent/"+id,
            		   type:"GET",
            		   success:function(result){
            			   //console.log(result);
            			   var agent = result.extend.agent;
            			   var moodl_box = document.getElementById('from_box');
            			   var mHtml = template('tpl_box',agent);
            			   moodl_box.innerHTML = mHtml;
            		   }
            		   
            		   
            		   
            	   }); 
             }
             
             var btn_del = $(".delete_btn");
             btn_del.click(function(){
            	 var cName=$(this).parents("tr").find(".cName").text();
            	// console.log(cName); 
            	 var cId=$(this).data("del");
            	//console.log(cId); 
            	//alert("确定删除【"+cName+"】吗？");
            	 if(confirm("确认删除[ "+cName+"]吗？")){
            		 $.ajax({
            		       url:"deleteAgent/"+cId,
            		       type:"post",
            			   success:function(result){
            				   alert(result.msg);
          					 //回到本页
          					 to_page(currentPage);
            				   
            			   }
            			 
            		 });
                                		 
            	 }
        			

            	
             });             
             
             
             /* user 注册弹出模态框*/
             
             var resLi=$("#res_li");
             resLi.click(function(){
            	 $("#user_res").modal({
            			backdrop : "static"
            	 
            	 });
             });
             
             /* 退出 */
             var exits=$('#exit_log');
               exits.click(function(){
            	   
            	 $.ajax({
            		url:"eixtLogin", 
            		type:"get",
            		success:function(result){
            			//console.log(result);
            			var code =result.code;
            			if(code==100){
            				confirm("您确定要退出吗？");
            				window.location.reload();
            			}else if(code==200){
            				alert("您还没有登陆！");
            			
            			}
            			
            		},
            		error:function(){
            			alert("请求异常，请重试！");
            			
            		}
            	 });
            	   
            	 
             });
             
             
             
             
             
             
             
      	 
	}
  
        	   
        	   
           
      	     		   
	  
    
    
    
    
    
    
    
    
