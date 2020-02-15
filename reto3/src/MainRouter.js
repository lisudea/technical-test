import React from 'react';
import Signin from './user/Signin';

import { Route, Switch } from 'react-router-dom';


const MainRouter = () => (
	<div>
		<Switch>
			
			<Route exact path="/" component={Signin}></Route>
			
		</Switch>
	</div>
);

export default MainRouter;